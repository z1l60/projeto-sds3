import BarCharts from "components/BarCharts";
import DataTable from "components/DataTable";
import DonutsCharts from "components/DonutsCharts";
import Footer from "components/Footer";
import NavBar from "components/NavBar";

const Dashboard = () => {
    return (
        <div>
            <>
                <NavBar />
                <div className="container">
                    <h1 className="text-primary py-3">Dashboard de Vendas</h1>

                    <div className="row px-3" >
                        <div className="col-sm-6" >
                            <h5 className="text-center text-secondary">Taxa de sucesso (%)</h5>
                            <BarCharts />
                        </div>
                        <div className="col-sm-6" >
                            <h5 className="text-center text-secondary">Total de Vendas</h5>
                            <DonutsCharts />
                        </div>
                    </div>

                    <div className="py-3" >
                        <h2 className="text-primary" >Total de vendas</h2>
                    </div>
                    <DataTable />
                </div>
                <Footer />
            </>
        </div>
    );
}

export default Dashboard;